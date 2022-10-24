from urllib.parse import urlparse
from django.urls import path
from . import views


urlpatterns=[
    path('', views.book),
    path('add_book/', views.addBook),
    path('<int:id>/', views.showBook),
    path('<int:id>/add_to_favorites/', views.addToFavorits),
    path('<int:id>/un_favorite/', views.unFavorite),
    path('<int:id>/update/', views.update),
    path('<int:id>/delete/', views.delete)
]