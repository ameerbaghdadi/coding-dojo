from django.urls import path
from . import views
from django.contrib.auth import views as auth_views

urlpatterns = [
    path('', views.index),
    path('register', views.register),
    path('login', views.login),
    path('register_success', views.registerPage),
    path('success', views.loginPage),
    path('logout', views.logout)
]