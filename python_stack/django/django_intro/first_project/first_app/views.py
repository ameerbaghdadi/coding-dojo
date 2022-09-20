from django.shortcuts import render, HttpResponse

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
    context = { 
        'username':request.POST['name'],
        'email':request.POST['email']
    }
    return render(request, 'data.html', context)