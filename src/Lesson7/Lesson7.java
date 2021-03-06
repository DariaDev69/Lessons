package Lesson7;

public class Lesson7 {
    /*
    Пакеты аналогично папка содержат наши java-классы.
    Основные цели пакетов:
    1. Защита доступа.
    Т.е. элементы класса в одном пакете не будут видны в другом пакете (если в коде не написано иного).
    2. Управление набором возможных имен.
    Т.е. в одном пакете не могут быть классы с одинакомыми именами. Одинаковые имена мб
    только у классов из разных пакетов. Ссылаться на классы из других пакетов мы можем только указывая полное имя класса
    (пример: package1.package2.B) и только в случае если этот класс public.
    3. Хранение связанных классов в одном месте.

    Контроллер доступа (access modifier).
    1. public, которые видны отовсюду.
    2. private. элемент будет виден только внутри класса.
    3.      (default). т.е. когда ничего не пишется. Т.е.элементы с таким модификатором видны только внутри своего пакета.
    4. protected. Видимость такая же как у дефолтного модификатора + элемент будет виден в классах-наследованных от того же класса,
    в котором наш элемент.

    !!! Внешние классы могут иметь только 2 модификатора доступа (дефолтный и public).
    !!! У локальных переменных нет никаких модификаторов доступа.
    */
}