from django.db import models

# Create your models here.
class BookManager(models.Manager):
    def basic_validator(self, postData):
        errors = {}
        # add keys and values to errors dictionary for each invalid field
        if len(postData['title']) < 5:
            errors["title"] = "Book name should be at least 5 characters"
        return errors

class Book(models.Model):
	title = models.CharField(max_length=255)
	desc =  models.TextField(max_length=255)
	created_at = models.DateTimeField(auto_now_add=True)
	updated_at = models.DateTimeField(auto_now=True)
	objects = BookManager()

class Author(models.Model):
	firstname = models.CharField(max_length=255)
	lastname = models.CharField(max_length=255)
	notes =  models.TextField(default="old notes")
	books = models.ManyToManyField(Book, related_name="authors")
	created_at = models.DateTimeField(auto_now_add=True)
	updated_at = models.DateTimeField(auto_now=True)
