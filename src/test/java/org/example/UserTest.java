package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    public User user0;
    public User user1;
    public User user2;
    //Тут перечисляются переменные, в которых будут вводиться данные для тестирования

    @BeforeEach
    void setUp(){
        user0 = new User("Анастасия", 45, Sex.FEMALE);
        user1 = new User("Антон", 53, Sex.MALE);
        user2 = new User("Катерина", 61, Sex.FEMALE);
        //Данный метод повторяется перед каждым тестом, чтобы заполить переменные данными
    }

    @Test
    void getAllUsers() {
        List<User> expected = User.getAllUsers();
        List<User> actual = new ArrayList<>();
        actual.add(user0);
        actual.add(user1);
        actual.add(user2);
        assertEquals(expected, actual);
        //Здесь тестируется возможность добавления пользователей в лист
        //В assertEquals можно указать два значения -
        //результат который получился с помощью тестируемого метода и ожидаемый результат
    }

    @Test
    void testGetAllUsers() {
    //Тут я к сожалению не придумал, как протестировать метод по количеству добавляемых значений, опираясь на перечисления в Sex
        }


    @Test
    void getHowManyUsers() {
            List<User> expected = User.getAllUsers();
            int how = expected.size();
            assertEquals(how, 3);
            //Тестировка метода size на возможность счёта переменных в листе
        }

    @Test
    void testGetHowManyUsers() {
        List<User> expected = User.getAllUsers(Sex.FEMALE);
        int how = expected.size();
        assertEquals(how, 2);
        //Мы выяснили, что установление из перечисления (Sex.MALE или Sex.FEMALE) отлично работает,
        // поэтому не вижу смысла его тестировать с каждым оставшимся методом
    }

    @Test
    void getAllAgeUsers() {
        List<User> expected = User.getAllUsers();
        int how = User.getAllAgeUsers();
        assertEquals(how, 159);
        //Тестировка метода getAllAgeUsers на возможность счёта общего возраста всех пользователей
    }

    @Test
    void testGetAllAgeUsers() {
    }

    @Test
    void getAverageAgeOfAllUsers() {
        List<User> expected = User.getAllUsers();
        int how = User.getAverageAgeOfAllUsers();
        assertEquals(how, 53);
        //Тестировка метода getAverageAgeOfAllUsers на нахождение среднего арифметического возраста всех пользователей
    }

    @Test
    void testGetAverageAgeOfAllUsers() {
    }
}