from django.db import models
from login_app.models import User

class BookManager(models.Manager):
    def basic_validator(self, postData):
        errors = {}
        if len(postData['desc']) < 5:
            errors["desc"] = "Description should be at least 5 characters"
        return errors

class Book(models.Model):
    title = models.CharField(max_length=255)
    desc = models.TextField(default = "")
    uploaded_by = models.ForeignKey(User, related_name="book_uploaded", on_delete = models.CASCADE)
    users_who_like = models.ManyToManyField(User, related_name="liked_books")
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    objects = BookManager()