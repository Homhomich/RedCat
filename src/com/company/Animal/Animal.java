package com.company.Animal;

// одно из свойств полиморфизма - расширяемость, те, как следует из названия, принятие различных форм.

// реализуя интерфейс, мы расширяем его, добавляем новый функционал, и при этом мы получаем некое множество классов
// схожих по области, но имеющие свои характерные черты, например, в различии функционала.

public interface Animal {
     void voice();
     AnimalType getType();
}