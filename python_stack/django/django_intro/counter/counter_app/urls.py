from django.urls import path     
from . import views
urlpatterns = [
    path('', views.counting),
    path('ByTwo/' , views.AddTwo),
    path('Reset/' , views.Reset)
]