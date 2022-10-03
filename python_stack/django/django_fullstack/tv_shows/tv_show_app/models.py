from email.policy import default
from django.db import models
import datetime

class ShowManager(models.Manager):
    def basic_validator(self, postData):
        errors = {}
        if len(postData['showTilte']) < 5:
            errors["showTilte"] = "Blog name should be at least 5 characters"
        if postData['date'] > str(datetime.date.today()):
            errors["date"] = "DAte not valid!"
        return errors

class Show(models.Model):
    title = models.CharField(max_length=255)
    network = models.CharField(max_length=255)
    releasedate = models.DateField(default=datetime.date.today())
    desc = models.CharField(max_length=255, default="None")
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    objects = ShowManager()