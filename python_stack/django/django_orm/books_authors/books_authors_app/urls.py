from django.urls import path
from . import views

urlpatterns = [
    path('', views.index),
    path('add_book', views.addBook),
    path('books/<int:id>', views.view),
    path('add/<int:id>', views.addAuthor)
]