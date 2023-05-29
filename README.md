# Кан Олеся Евгеньевна БПИ218 ИДЗ по КПО 4
## Сервисы:
### demo - авторизация, регистрация и получение данных о пользователе
### RESToran - сервис обработки заказов и блюд
#### БД:
```
spring.datasource.url=jdbc:h2:file:~/data/users;AUTO_SERVER=TRUE
spring.datasource.username=sa
spring.datasource.password=password
```
#### Первым запускается сервис demo, далее RESToran

## Архитектура:
### Авторизация:
#### Клиент отправляет на сервер запрос на регистрацию или авторизацию и в случае успешной решистрации/авторизации ему выдается jwt-token и доступ к ресторану.

### Ресторан:
#### Клиент отправляет запросы на сервер ресторана, RESToran обрабатывает эти запросы и возвращает ответы от соответствующих запросов. В случае отправки на сервер запроса на создание заказа с течением времени меняется его статус.
