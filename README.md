# crazy_monkey_bank
### Стэк проекта
#### Backend
- Spring Boot
- Spring Cache
- Spring Secutiry
- JPA
### Инструменты
- Docker

## Структура базы 

![Снимок экрана от 2021-06-24 22-08-22](https://user-images.githubusercontent.com/37213273/123328717-9806b180-d544-11eb-9b6b-9c141704dce2.png)

## Запросы на добавление элементов
### добавление валюты
- insert into valute (id,code,description,name) values(1,'BGN','975','Болгарский лев');
- insert into valute (id,code,description,name) values(2,'BHD','048','Бахрейнский динар');
- insert into valute (id,code,description,name) values(3,'BIF','108','Бурундийский франк');
- insert into valute (id,code,description,name) values(4,'BND','096','Брунейский доллар');
- insert into valute (id,code,description,name) values(5,'RUP','000','Приднестрровский рубль');
### добавление Банков
- insert into bank (id,code,name) values (1,'61','Банк-филлиал Тирасполя');
- insert into bank (id,code,name) values (2,'16','Банк-филлиал Кишинев');
- insert into bank (id,code,name) values (3,'17','Банк-филиал Бэльцы');
### добавление ролей 
- insert into role (id,code,name) values (1,'ADMIN','Администратор');
- insert into role (id,code,name) values (2,'CLIENT','Клиент');
- insert into role (id,code,name) values (3,'VIP','ВИП Клиент');
### добавление типа счета
- insert into account_type (id,code,name) values (1,'CURRENT','Текущий счет');
- insert into account_type (id,code,name) values (2,'TRANSIT','Транзитный счет');
### добавление детальной информации о пользователе
- insert into user_detail  (id,fam,im,ot,contact_number,date_birth) values(1,'Балджи','Евгений','Федорович','+3737783503',try_convert(date, '16-04-2015', 105));
- insert into user_detail  (id,fam,im,ot,contact_number,date_birth) values(2,'Федотов','Александр','Алексеевич','+3737783503',try_convert(date, '16-04-2015', 105));
- insert into user_detail  (id,fam,im,ot,contact_number,date_birth) values(3,'Абалдин','Тимофей','Абдурахаманович','+3737783503',try_convert(date, '16-04-2015', 105));
### добавление ползователей
- insert into user_  (id ,active,login,password,user_detail_id) values (1,1,'sam','w3347986',1);
- insert into user_  (id ,active,login,password,user_detail_id) values (2,1,'frank','w3347986',2);
- insert into user_  (id ,active,login,password,user_detail_id) values (3,1,'tank','w3347986',3);
### добавление счетов
- insert into account (id,acc,account_type_id,bank_id,user_id,valute_id,balance) values (1,'123123123123',1,1,1,1,500.0);
- insert into account (id,acc,account_type_id,bank_id,user_id,valute_id,balance) values (2,'12312123123',1,1,2,1,120.1);
### добавление истории платежей со счета
- insert into account_history  (id,account_id,oper_time,user_id,amount) values (1,1,try_convert(date, '16-04-2020', 105),1);
- insert into account_history  (id,account_id,oper_time,user_id,amount) values (2,1,try_convert(date, '16-04-2020', 105),1,-300);
- insert into account_history  (id,account_id,oper_time,user_id,amount) values (3,1,try_convert(date, '16-04-2020', 105),1,150);
- insert into account_history  (id,account_id,oper_time,user_id,amount) values (4,1,try_convert(date, '16-04-2020', 105),2,-25)
## Создание процедуры
     --Создаем процедуру
   CREATE PROCEDURE getAccoutById 
   (
        --Входящие параметры
        @id INT
          )
   AS
   BEGIN
        --Возвращаем данные
  select account.id , account.acc,account.balance,valute.name  as valute, account_type.name  as account_type,
(select max(account_history.oper_time) from account_history  where account_history.user_id = @id) as oper_time
from account 
inner join valute on valute.id = account.valute_id 
inner join account_type on account_type.id = account.account_type_id 
where account.user_id = @id 
   END
   ### Вызов процедуры
   EXECUTE getAccoutById @id =? ввести числовое значение
## Запуск приложение
Для данной работы использовался Docker
### команда запуска 
- docker run -e 'ACCEPT_EULA=Y' -e 'SA_PASSWORD=yourStrong(!)Password' -e 'MSSQL_PID=Express' -p 1433:1433 -d mcr.microsoft.com/mssql/server:2017-latest-ubuntu 
### Вход в базу
- хост localhost или 127.0.0.1
- порт 1433
- логин sa
- пароль yourStrong(!)Password

