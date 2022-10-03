from email.mime import audio
from multiprocessing import context
from platform import release
from urllib import request
from django.shortcuts import render, redirect
from .models import *
from django.contrib import messages
from datetime import datetime
from time import strftime

def index(request):

    return render(request, 'index.html')