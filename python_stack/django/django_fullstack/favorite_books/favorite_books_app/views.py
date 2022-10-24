from turtle import title
from django.shortcuts import render, redirect
from login_app.models import *
from favorite_books_app.models import *

def book(request):
    if 'user_id' in request.session:
        context = {
            'user':User.objects.get(id=request.session['user_id']),
            'books':Book.objects.all().order_by('-id'),
        }
        return render(request,'book.html', context)
    else:
        return redirect('/')

def addBook(request):
    title = request.POST['title']
    desc = request.POST['desc']
    logged_user = User.objects.get(id=request.session['user_id'])
    new_book = Book.objects.create(title = title, desc = desc, uploaded_by = logged_user)

    logged_user.liked_books.add(new_book)
    
    return redirect('/')

def showBook(request, id):
    context = {
        'show_book':Book.objects.get(id=id),
        'user':User.objects.get(id=request.session['user_id'])
    }

    return render(request, 'showbook.html', context)

def addToFavorits(request, id):
    logged_user = User.objects.get(id=request.session['user_id'])
    favorite_book = Book.objects.get(id=id)

    logged_user.liked_books.add(favorite_book)

    return redirect('/books/'+str(id)+'/')

def unFavorite(request, id):
    logged_user = User.objects.get(id=request.session['user_id'])
    favorite_book = Book.objects.get(id=id)

    logged_user.liked_books.remove(favorite_book)

    return redirect('/books/'+str(id)+'/')

def update(request, id): 
    update_book = Book.objects.get(id=id)
    update_book.title = request.POST['title']
    update_book.desc = request.POST['desc']
    update_book.save()

    return redirect ('/books/'+str(id)+'/')

def delete(request, id):
    delete_book = Book.objects.get(id=id)
    delete_book.delete()

    return redirect ('/books/')




