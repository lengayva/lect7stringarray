package ru.netology.stats;
public class StatsService {
    public long sum(long[] sales){
        long totalSale = 0;
        for (long sale : sales) {// используем этот цикл, тк не надо знать номер.каждый элемент массива будет по очереди сохранятся в переменную sale
            totalSale += sale;
        }
        return totalSale;
    }
    public long average(long[] sales){//среднее=сумма/количество(длина массива)
        return sum(sales) / sales.length;//вызываем уже существ метод суммы и передаём туда массив продаж
    }

    public int maxMonth(long[] sales){// номер месяца, в котором продажи максимальны
        int monthMaxSale = 0;//предполагаем что самый первый элемент массива и есть макс продажа
        for (int i = 0; i < sales.length; i++) {//перебираем элементы массива.если находится более подходящий, обновляем это значение
            if(sales[i] >= sales[monthMaxSale])//если очередная продажа больше или равна чем то, что раньше считали макс продажей, обновляем
                monthMaxSale = i;
        }
        return monthMaxSale + 1;// тк в массивах номера ячеек с нуля
    }

    public int minMonth(long[] sales  ){// номер месяца, в котором продажи минимальны
        int monthMinSale = 0;//предполагаем что самый первый элемент массива и есть мин продажа
        for (int i = 0; i < sales.length; i++) {//перебираем элементы массива.если находится более подходящий, обновляем это значение
            if(sales[i] <= sales[monthMinSale])//если очередная продажа меньше или равна чем то, что раньше считали мин продажей, обновляем
                monthMinSale = i;
        }
        return monthMinSale + 1;// тк в массивах номера ячеек с нуля
    }

    public int monthBellowAverage(long[] sales){//количество месяцев, в которых продажи ниже среднего
        int counter = 0;//переменная хранит количество месяцев
        long averageSale = average(sales);//средние продажи
        for (long sale : sales) {
            if (sale < averageSale)// если очередная продажа ниже чем средняя, увеличиваем счётчик
                counter++;
        }
        return counter;


    }

    public int monthAboveAverage(long[] sales){//количество месяцев, в которых продажи выше среднего
        int counter = 0;//переменная хранит количество месяцев
        long averageSale = average(sales);//средние продажи
        for (long sale : sales) {
            if (sale > averageSale)// если очередная продажа выше чем средняя, увеличиваем счётчик
                counter++;
        }
            return counter;


    }
}
