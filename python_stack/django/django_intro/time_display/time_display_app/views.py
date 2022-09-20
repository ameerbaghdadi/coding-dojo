from django.shortcuts import render
from time import gmtime, localtime, strftime

# Create your views here.
def display(request):
    context = {
        'date': strftime("%b %d, %Y", localtime()),
        'time': strftime("%H:%M %p", localtime())
    }
    return render(request, 'show.html', context)