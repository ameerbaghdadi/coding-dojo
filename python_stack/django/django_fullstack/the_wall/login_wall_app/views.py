from email.mime import audio
from multiprocessing import context
from platform import release
from urllib import request
from django.shortcuts import render, redirect
from .models import *
from django.contrib import messages
from datetime import datetime
from time import strftime
import bcrypt

def index(request):

    return render(request, 'index.html')

def register(request):
    errors = User.objects.basic_validator(request.POST)
    if len(errors) > 0:
        for key, value in errors.items():
            messages.error(request, value)
        return redirect('/register_login')
    else:
        password = request.POST['psw']
        psw_hash = bcrypt.hashpw(password.encode(), bcrypt.gensalt()).decode()
        print(psw_hash)
        User.objects.create(firstname=request.POST['fname'], 
        lastname=request.POST['lname'], email=request.POST['email'], password=psw_hash)
        request.session['username'] = User.objects.last().firstname

    return redirect('/register_success')

def login(request):
    user = User.objects.filter(email=request.POST['email'])
    if user:
        logged_user = user[0]

        if bcrypt.checkpw(request.POST['psw2'].encode(), logged_user.password.encode()):
            request.session['userid'] = logged_user.id

            return redirect('/success')
    
    return redirect('/register_login')

def registerPage(request):
    
    return render(request, 'register.html')

def loginPage(request):

    return render(request, 'login.html')

def logout(request):
    del request.session['userid']

    return redirect('/register_login')