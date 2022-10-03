from django.urls import path     
from . import views

urlpatterns = [
    path('', views.mainPage),
    path('submited/', views.submited_number),
    path('delete/', views.delete)
]