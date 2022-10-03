from email.mime import audio
from urllib import request
from django.shortcuts import render, redirect
from .models import *
from django.contrib import messages

# Create your views here.
def index(request):
    context = {
        'all_books':Book.objects.all()
    }

    return render(request, 'form.html', context)

def addBook(request):
    errors = Book.objects.basic_validator(request.POST)
    if len(errors) > 0:
        for key, value in errors.items():
            messages.error(request, value)
        return redirect('/')

    Book.objects.create(title=request.POST['title'], 
    desc=request.POST['desc'])

    return redirect('/')

def view(request, id):
    this_book = Book.objects.get(id=id)
    context = {
        'book_id':Book.objects.get(id=id),
        'this_book':this_book.authors.all(),
        'all_author':Author.objects.all()
    }
    
    return render(request, 'view.html', context)

def addAuthor(request, id):
    this_book = Book.objects.get(id=int(id))
    this_author = Author.objects.get(id = request.POST['author_to_book'])

    this_book.authors.add(this_author)

    return redirect('/books/'+str(id))