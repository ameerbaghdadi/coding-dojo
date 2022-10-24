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

def mainPage(request):

    return render(request, 'mainpage.html')

def postMessage(request, id):

    this_user = User.objects.get(id=id)
    this_user.messages.message = request.POST['post_message']

    return redirect('/')