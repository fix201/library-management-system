import re, random
from random import randint, choice
from faker import Faker
from datetime import datetime
import pyperclip

fake = Faker()

def generate_isbn():
    return str(randint(978, 983))+'-'+str(randint(0, 9))+'-'+str(randint(10, 99))+'-'+str(randint(100000, 999999))+'-'+str(randint(0, 9))

def generate_random_from_list(list):
    return choice(list)

def generate_date_between():
    return fake.date_between_dates(date_start=datetime(2005,1,1), date_end=datetime(2019,12,31))

def generate_name():
    return fake.name()

def generate_email_multi(names):
    for name in names:
        email = ''
        separator = random.choice(separators)
        for n in name.lower().split():
            email = email + n + separator
        email = email[:-1] if email[-1] in separator else email
        email = email + '@'+random.choice(emails)
        print(email)

def generate_email_from_name(name):
    first = re.sub(r'\W+', '', name.lower().split()[0])
    last = re.sub(r'\W+', '', name.lower().split()[1])

    return first+random.choice(separators)+last+'@'+random.choice(emails)

def generate_email_from_names(names):
    separators = ['_','.','']
    
    for name in names:
        first = re.sub(r'\W+', '', name.lower().split()[0])
        last = re.sub(r'\W+', '', name.lower().split()[1])
        email = first+random.choice(separators)+last+'@'+random.choice(emails)
        print(email)

def generate_phone_number():
    return f'{fake.msisdn()[3:]}'

def generate_address():
    return fake.address().replace('\n',' ')

def generate_ssn():
    return fake.ssn()

def generate_emergency_contact():
    name = generate_name()
    return name + ' ' + generate_phone_number() + ' ' + generate_email_from_name(name)

format_list = ['Hardcover', 'Paperback', 'EBook', 'Softcover', 'PDF', 'Pamphlet', 'Large Print']
language_list = ['English','French']
emails = ['gmail.com', 'aol.com','yahoo.com','hotmail.com','me.com','icloud.com','verizon.net','sbcglobal.net']
names = ['David Barnes','Rebecca King','Ana Hill','Michael Garcia','Benjamin Charles','Amy Castillo','Terry Hall','Kyle Green MD','Alyssa Santos','Tracy Brown','Anthony Greer','Darren Perez','Gary Woods','Jeffrey Brooks','Amy Baker','Stephen Hart','Chad Bryan','Jason Carney','Sierra Mitchell','Maria Castro','Angela Willis','Jonathon Morton','Terry Mitchell PhD','Kimberly Morris','David Duffy','Samantha Arnold','Colleen Freeman MD','Ann Waters','Michael Walker','Karla Perez']
library_branches = ['Library of Ashurbanipal','Library of Alexandria','Library of Pergamum','The Villa of the Papyri','Library of Celsus','The Imperial Library of Constantinople','The House of Wisdom','New York Public Library','Brooklyn Public Library','National Library of China','State Library of Victoria','Library of Congress','British Library','Royal Danish Library','Berlin State Library','Russian State Library','Bibliothque nationale de France','National Library of Russia','Trinity College Library','BODLEIAN LIBRARY']
separators = ['_','.','']

def main():
    generate_email_multi(library_branches)
    # for _ in range(20):
    #     print(generate_email_multi(library_branches))

main()