public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль" + "\n");
        byte qoresQuantity = 4;
        short cpuFrequency = 2000;
        int ramMemory = 8388608;
        long hardDiskValue = 125829120;
        float screenDiagonal = 39.624f;
        double chanceToBuyNewNotebook = 0.0000000001;
        char intelSeries = 'i';
        boolean isOld = true;
        System.out.println("Ноутбук Intel Core " + intelSeries + "3");
        System.out.println("Количество ядер: " + qoresQuantity);
        System.out.println("Частота процессора: " + cpuFrequency + " MHz");
        System.out.println("Оперативная память: " + ramMemory + " Kb");
        System.out.println("Объем жесткого диска: " + hardDiskValue + " Kb");
        System.out.println("Диагональ экрана: " + screenDiagonal + " cm");
        System.out.println("Шанс купить новый ноут равен " + chanceToBuyNewNotebook + " %");
        System.out.println("Старый ноут ? Sad but " + isOld + "\n");

        System.out.println("2. Расчет стоимости товара со скидкой" + "\n");
        int priceGoodsX = 100;
        int priceGoodsY = 200;
        double discount = 0.11;
        System.out.println("Сумма скидки: " + (priceGoodsX + priceGoodsY) * discount + " руб.");
        System.out.println("Общая стоимость товаров со скидкой: " + 
                (priceGoodsX + priceGoodsY) * (1 - discount) + " руб." + "\n");
        
        System.out.println("3. Вывод на консоль слова JAVA" + "\n");
        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a" + "\n");

        System.out.println("4. Отображение min и max значений числовых типов данных" + "\n");
        byte byteNumber = 127;
        short shortNumber = 32767;
        int intNumber = 2147483647;
        long longNumber = 9223372036854775807l;
        System.out.println("первоначальное значение byte: " + byteNumber);
        System.out.println("первоначальное значение short: " + shortNumber);
        System.out.println("первоначальное значение int: " + intNumber);
        System.out.println("первоначальное значение long: " + longNumber + "\n");
        byteNumber++;
        shortNumber++;
        intNumber++;
        longNumber++;
        System.out.println("значение после инкремента byte: " + byteNumber);
        System.out.println("значение после инкремента short: " + shortNumber);
        System.out.println("значение после инкремента int: " + intNumber);
        System.out.println("значение после инкремента long: " + longNumber + "\n");
        byteNumber--;
        shortNumber--;
        intNumber--;
        longNumber--;
        System.out.println("значение после декремента byte: " + byteNumber);
        System.out.println("значение после декремента short: " + shortNumber);
        System.out.println("значение после декремента int: " + intNumber);
        System.out.println("значение после декремента long: " + longNumber + "\n");

        System.out.println("5. Перестановка значений переменных" + "\n");
        double a = 1.1;
        double b = 2.2;
        System.out.println("Перестановка с помощью третьей переменной:" + "\n");
        System.out.println("Исходные значения: а = " + a + " , b = " + b);
        double c = a;
        a = b;
        b = c;
        System.out.println("Новые значения: а = " + a + " , b = " + b + "\n");
        System.out.println("Перестановка с помощью арифметических операций:" + "\n");
        System.out.println("Исходные значения: а = " + a + " , b = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("Новые значения: а = " + a + " , b = " + b + "\n");
        System.out.println("Перестановка с помощью побитовой операции ^:" + "\n");
        System.out.println("Исходные значения: а = " + a + " , b = " + b);
        a *= 10;
        b *= 10;
        int d = (int) a;
        int f = (int) b;
        d ^= f;
        f ^= d;
        d ^= f;
        a = d / 10.0;
        b = f / 10.0;
        System.out.println("Новые значения: а = " + a + " , b = " + b + "\n");

        System.out.println("6. Вывод символов и их кодов" + "\n");
        int code1 = 35;
        int code2 = 38;
        int code3 = 64;
        int code4 = 94;
        int code5 = 95;
        System.out.println(code1 + " - " + (char) code1);
        System.out.println(code2 + " - " + (char) code2);
        System.out.println(code3 + " - " + (char) code3);
        System.out.println(code4 + " - " + (char) code4);
        System.out.println(code5 + " - " + (char) code5 + "\n");

        System.out.println("7. Произведение и сумма цифр числа" + "\n");
        int srcNum = 345;
        int firstDigit = srcNum / 100;
        int secondDigit = (srcNum / 10) % 10;
        int thirdDigit = srcNum % 10;
        System.out.println("Сумма цифр числа " + srcNum + " = " + 
                (firstDigit + secondDigit + thirdDigit));
        System.out.println("Произведение цифр числа " + srcNum + " = " + 
                (firstDigit * secondDigit * thirdDigit) + "\n");

        System.out.println("8. Вывод на консоль ASCII-арт Дюка" +"\n");
        char rb = '\u0029';
        char lb = '\u0028';
        char rs = '\u002F';
        char ls = '\\';
        char ul = '\u005F';
        System.out.println("     " + rs + ls + "     ");
        System.out.println("    " + rs + "  " + ls + "    ");
        System.out.println("   " + rs + ul + lb + " " + rb + ls + "   ");
        System.out.println("  " + rs + "      " + ls + "  ");
        System.out.println(" " + rs + ul + ul + ul + ul + rs + ls + ul + ul + ls + " " + "\n");

        System.out.println("9. Отображение количества сотен, десятков и единиц числа" + "\n");
        srcNum = 123;
        System.out.println("Число " + srcNum + " содержит: ");
        System.out.println("1. " + srcNum / 100 + " сотню");
        System.out.println("2. " + (srcNum / 10) % 10 + " десятка");
        System.out.println("3. " + srcNum % 10 + " единицы" + "\n");

        System.out.println("10. Преобразование секунд" + "\n");
        int totalSecs = 86399;
        int hours = totalSecs / 3600;
        int minutes = (totalSecs % 3600) / 60;
        int seconds = totalSecs % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
