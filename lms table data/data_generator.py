from random import randint, choice
from faker import Faker
from datetime import datetime

fake = Faker()

def generate_isbn():
    return str(randint(978, 983))+'-'+str(randint(0, 9))+'-'+str(randint(10, 99))+'-'+str(randint(100000, 999999))+'-'+str(randint(0, 9))

def generate_random_from_list(list):
    return choice(list)

def generate_date_between():
    return fake.date_between_dates(date_start=datetime(2005,1,1), date_end=datetime(2019,12,31))

format_list = ['Hardcover', 'Paperback', 'EBook', 'Softcover', 'PDF', 'Pamphlet', 'Large Print']
language_list = ['English','French']

for i in range(26):
    print(generate_date_between())

print('hello')