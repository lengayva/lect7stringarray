package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    public void testSum(){
        StatsService service = new StatsService();//сумма всех продаж
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};//создаём массив

        long actual = service.sum(sales);//действительный рез у сервиса вызываем метод sum и передаём туда массив
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;//ожидаемый

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverage(){//средняя сумма продаж в месяц
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};//создаём массив

        long actual = service.average(sales);//действительный рез у сервиса вызываем метод и передаём туда массив
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;//ожидаемый

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxMonth(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};//создаём массив

        long actual = service.maxMonth(sales);//действительный рез у сервиса вызываем метод и передаём туда массив
        long expected = 8;//ожидаемый

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinMonth(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};//создаём массив

        long actual = service.minMonth(sales);//действительный рез у сервиса вызываем метод и передаём туда массив
        long expected = 9;//ожидаемый

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBellowAverage(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};//создаём массив

        long actual = service.monthBellowAverage(sales);//действительный рез у сервиса вызываем метод и передаём туда массив
        long expected = 5;//ожидаемый

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAboveAverage(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};//создаём массив

        long actual = service.monthAboveAverage(sales);//действительный рез у сервиса вызываем метод и передаём туда массив
        long expected = 5;//ожидаемый

        Assertions.assertEquals(expected, actual);
    }


}