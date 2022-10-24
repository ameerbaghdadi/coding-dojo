import email
from tkinter import N
from django.db import models
from email.policy import default
import re
from login_wall_app.models import User

class Message(models.Model):
    message = models.TextField()
    users = models.ForeignKey(User, related_name="messages", on_delete = models.CASCADE)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

class Comment(models.Model):
    comment = models.TextField()
    users = models.ForeignKey(User, related_name="comments", on_delete = models.CASCADE)
    messages = models.ForeignKey(Message, related_name="comments", on_delete = models.CASCADE)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
