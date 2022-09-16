# Ms_Email

<p align="center">
<img src="https://user-images.githubusercontent.com/100395899/190535681-7fe1c0e7-49fc-4d2a-80dd-5e59b6f37224.gif" width="1100" height="250" />
</p>

> Microsserviço para envio de email usando o JavaMailSender e o servidor SMTP do Gmail.

- Para a execução do microsserviço, deve ser enviado um payload com o formato a seguir:

~~~
{
	"ownerRef": "Francielle",
	"emailFrom": "franciellesales0@gmail.com",
	"emailTo": "francielle_sales@hotmail.com",
	"subject": "Teste mensageria",
	"text": "Teste corpo e-mail"
}
~~~

- O retorno terá o formato:

~~~
{
    "emailId": "f7921d68-3301-40fd-9143-06434d6ff849",
    "ownerRef": "Francielle",
    "emailFrom": "franciellesales0@gmail.com",
    "emailTo": "francielle_sales@hotmail.com",
    "subject": "Teste mensageria",
    "text": "Teste corpo e-mail",
    "sendDateEmail": "2022-09-15T22:00:16.3891942",
    "statusEmail": "SENT"
}
~~~

- No e-mail do ownerRef ("emailFrom"), podemos ver que o envio foi realizado:

<p align="center">
<img src = "https://user-images.githubusercontent.com/100395899/190537740-2d9cacc2-3391-4872-8c31-0a24e016a79a.png" width="1100px" hight="350px">
</p>


- E no e-mail do "emailFrom" podemos que o envio foi recebido.

<p align="center">
<img src = "https://user-images.githubusercontent.com/100395899/190538432-142153b2-b09e-49b1-af0e-181881e70b6d.png" width="1100px" hight="350px">
</p>

---

**Esse microsserviço foi realizado seguindo os ensinamentos dos seguintes vídeos:**

- <a href="https://www.youtube.com/watch?v=ZBleZzJf6ro&t=1873s&ab_channel=MichelliBrito">Criando um microsservice de envio de email</a>
- <a href="https://www.youtube.com/watch?v=V-PqR0BxA8c&t=1s&ab_channel=MichelliBrito">Comunicação assíncrona entre microsservices</a>
