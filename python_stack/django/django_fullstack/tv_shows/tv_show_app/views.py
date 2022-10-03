from email.mime import audio
from multiprocessing import context
from platform import release
from urllib import request
from django.shortcuts import render, redirect
from .models import *
from django.contrib import messages
from datetime import datetime
from time import strftime

# Create your views here.
def index(request):

    return render(request, 'addForm.html')

def createShow(request):

    errors = Show.objects.basic_validator(request.POST)
    if len(errors) > 0:
        for key, value in errors.items():
            messages.error(request, value)

            return redirect('/show/new')
    else:
        this_show = Show.objects.create(title=request.POST['showTilte'], 
        network=request.POST['network'], releasedate=request.POST['date'], desc=request.POST['desc'])

    return redirect('/shows/'+str(this_show.id))

def viewShows(request, id):
    context = {
        'all_shows':Show.objects.get(id=int(id))
    }

    return render(request, 'show.html', context)

def allShows(request):
    context = {
        'all_shows':Show.objects.all()
    }

    return render(request, 'allShows.html', context)

def editShow(request, id):
    context = {
        'all_shows':Show.objects.get(id=int(id)),
        'show_release_date':Show.objects.get(id=id).releasedate.strftime("%Y-%m-%d")
    }

    return render(request, 'editShow.html', context)

def updateShow(request, id):

    this_show = Show.objects.get(id=int(id))
    this_show.title = request.POST['showTilte']
    this_show.network = request.POST['network']
    this_show.releasedate = request.POST['date']
    this_show.desc = request.POST['desc']

    this_show.save()

    return redirect('/shows/'+str(id)+'/edit')

def deleteShow(request, id):
    this_show = Show.objects.get(id=int(id))
    this_show.delete()

    return redirect('/shows')