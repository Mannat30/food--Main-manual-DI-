# Food Ordering System (Manual Dependency Injection)

## 🚀 Project Overview
This project demonstrates the transition from **Tight Coupling** to **Loose Coupling** using **Manual Dependency Injection (Constructor Injection)** in Java.

---

## ❌ Problems with Tight Coupling

In the initial design, `OrderService` was directly creating objects:

```java
PaymentService payment = new UpiPayment();
NotificationService notification = new EmailService();

MAINLY--TIGHT COUPLING MAI ->SERVICE CLASS=OBJECT CREATION+MANAGE
  BUT IN LOOSE COUPLING -MANUAL DEPENDEY INJECTION ->MAIN CLASS-OBJECT CREATION
                                                     SERVICE CLASS-USE IT
