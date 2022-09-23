from django.shortcuts import render, redirect
from .models import Users

# Create your views here.
def display(request):
    return render(request, 'form.html')


def addUser(request):
    Users.objects.create(firstname=request.POST['firstname'], lastname=request.POST['lastname'], email=request.POST['email'], age=request.POST['age'] )
    
    return redirect('/display')

def showdata(request):
    context = {
        'Users':Users.objects.all()
    }

    return render(request, "form.html", context)