from django.urls import path
from . import views

urlpatterns = [
    path('show/new', views.index),
    path('shows/create', views.createShow),
    path('shows/<int:id>', views.viewShows),
    path('shows', views.allShows),
    path('shows/<int:id>/edit', views.editShow),
    path('shows/<int:id>/update', views.updateShow),
    path('shows/<int:id>/destroy', views.deleteShow)
]