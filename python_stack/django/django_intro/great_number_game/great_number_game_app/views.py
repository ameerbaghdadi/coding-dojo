from django.shortcuts import render, redirect, HttpResponse
import random


# Create your views here.
def mainPage(request):
    return render(request, 'show.html')

# def submited_number(request):
#     your_number = int(request.POST['submited'])