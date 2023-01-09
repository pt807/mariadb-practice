## employee db install(restore)

1.  백업 db압축 풀기
```sh
#unzip employees_db.zip
```
2.  employees 데이터베이스 생성 및 hr 계정 생성 및 권한 추가
```sh
# mysql -u root -p
Enter password:
Mariadb [{none}]> create database employees;
Mariadb [{none}]> show databases;
Mariadb [{none}]> create user 'hr'@'192.168.%' identified by 'hr';
Mariadb [{none}]> flush privileges;
```
3.  restore
```sh
# cd employees_db
# mysql -u root -D employees -p < employees.sql
```
