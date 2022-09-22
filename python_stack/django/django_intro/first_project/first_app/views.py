from django.shortcuts import render, redirect, HttpResponse
from .models import User

# Create your views here.
def method1(request):
    return HttpResponse('Hello from Djanco')

def method2(request, id):
    return HttpResponse('the number is:' + id)

def method3(request):
    context = {
        'var1':"ameer",
        'var2':"7",
        'var3':[1,2,3,4,5]
    }
    return render(request, 'index.html', context)

def rform(request):
    return render(request, 'form.html')

def handel(request):
    #request.session['username']=request.POST['name']
    #request.session['email']=request.POST['email']

    User.objects.create(username=request.POST['name'], email=request.POST['email'])
    
    return redirect('/show')

def showdata(request):
    
    return render(request, 'data.html')

def visits(request):
    if 'counter' not in request.session:
        request.session['counter'] = 0
    else:
        request.session['counter'] += 1

    return render(request, 'visits.html')


    #num_visits = request.session.get('num_visits', 0)
    #request.session['num_visits'] = num_visits + 1