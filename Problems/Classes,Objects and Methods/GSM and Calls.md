Да се създадат класовете Call и GSM, представящи съответно
телефонно обаждане и телефон.

Класът Call да съдържа следните полета:

priceForAMinute – статично поле, което показва цената на разговор за
минута
caller - показва телефона, от който е направено повикването
receiver - показва телефона, към който е направено повикването
duration - дължината на разговора (в минути)

Класът GSM да съдържа полетата:
model – модел на телефона
hasSimCard – дали в телефона е заредена SIM карта
simMobileNumber – номер на SIM картата(телефонен номер), ако е
заредена такава.
outgoingCallsDuration – общото време (в минути) на изходящите
повиквания
lastIncomingCall – последното входящо повикване
lastOutgoingCall – последното изходящо повикване

Да се напишат следните методи за класа GSM:
- insertSimCard(simMobileNumber) – метода задава номер(сим карта)
на телефона. Да се провери дали подаденият номер е валиден
(започва с 08 и се състои от 10 цифри). Ако номерът е валиден, го
задава на телефона и задава стойност true на полето hasSimCard
- removeSimCard() - премахва сим картата от телефона (задава false
на полето hasSimCard)

- call( receiver, duration) – В тялото му да се направят проверки за:
• дали въведената дължина на разговора е валидна
• дали двата телефона (този за който се извиква метода и
този към който се прави обаждането) не са един и същ телефон
• дали и двата телефона имат сим карта

Ако всички проверки преминат успешно, метода прави обаждане с
продължителност duration към телефона, подаден като параметър.
Задава това обаждане като последно изходящо повикване на
телефона от който се прави повикването (телефона за който се
извиква метода) и задава същото обаждане като последно входящо за
телефона към който се прави обаждането.

Осен това увеличава стойността на outgoingCallsDuration със
дължината на разговора за телефона от който се прави обаждането.

Да се направи и метод getSumForCall(), който връща сумата,
начислена за изходящите повиквания на телефона (общото време на
изходящите повиквания по цената за минута - priceForAMinute).

Да се направят два метода
printInfoForTheLastOutgoingCall() и
printInfoForTheLastIncomingCall()
които извеждат информация за последното изходящо/входящо
повиквана на телефона (ако има такова)
