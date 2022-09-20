from django.shortcuts import render

# Create your views here.
def index(request):
    return render(request, 'index.html')

def show(request):
    context = { 
        'name':request.POST['name'],
        'location':request.POST['location'],
        'language':request.POST['language'],
        'fav_language':request.POST['fav_language'],
        'status':request.POST['status'],
        'comment':request.POST['comment']
    }
    return render(request, 'show.html', context)