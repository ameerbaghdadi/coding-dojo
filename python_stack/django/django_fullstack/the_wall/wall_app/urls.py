from django.urls import path
from . import views
from django.contrib.auth import views as auth_views

urlpatterns = [
    path('', views.mainPage),
    path('post_message/<int:id>', views.postMessage)
]