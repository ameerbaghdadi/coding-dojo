from django.shortcuts import render, redirect
from .models import *

def index(request):
    context = {
        'Dojo':Dojo.objects.all(),
        'Ninja':Ninja.objects.all()
    }

    return render(request, 'index.html', context)

def adddojo(request):
    Dojo.objects.create(name=request.POST['name'], 
    city=request.POST['city'],
    state=request.POST['state'])

    return redirect('/')

def addninja(request):
    dojo1 = Dojo.objects.get(id=request.POST['selectDojo'])

    Ninja.objects.create(firstname=request.POST['firstname'],
    lastname=request.POST['lastname'],
    dojo=dojo1)

    return redirect('/')

def deleteall(request):
    d = Dojo.objects.get(id=request.POST['del'])
    d.delete()
    
    return redirect('/')