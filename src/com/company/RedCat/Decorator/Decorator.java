package com.company.RedCat.Decorator;

import com.company.Animal.Cat;
import com.company.RedCat.RedCat;

/* паттерн декоратор позволяет нам добавлять функционал, и при этом не требуется писать новый
   полноценный класс (например, класс рыжей кошки с клавиатурой) или переписывать старый
   также это удобно тем, что обертка над классом может быть добавлена динамически
*/
public abstract class Decorator extends Cat {
        public abstract String aboutCat();
}
