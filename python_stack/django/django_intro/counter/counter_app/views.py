# Create your views here.
from django.shortcuts import render, redirect, HttpResponse

# Create your views here.
def counting(request):
    counter = request.session.get('counter', 0)
    request.session['counter'] = counter + 1
    return render(request , 'visits.html')

def AddTwo(request):
    request.session['counter'] +=1
    return  redirect ('/')
    

def Reset(request):
    request.session['counter'] = 0
    return  redirect ('/')
    