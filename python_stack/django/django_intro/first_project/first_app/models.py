import email
from django.db import models

# Create your models here.

    
class User(models.Model):
    username = models.CharField(max_length=45)
    email = models.CharField(max_length=45)
    age = models.IntegerField(null=True)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)