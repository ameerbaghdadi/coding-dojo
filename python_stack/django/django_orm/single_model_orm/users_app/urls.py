from django.urls import path
from . import views

urlpatterns = [
    path('', views.display),
    path('show_table', views.addUser),
    path('display', views.showdata)
]