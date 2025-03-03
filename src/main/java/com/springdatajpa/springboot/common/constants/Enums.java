package com.springdatajpa.springboot.common.constants;

public class Enums {
    public enum Gender {
        MALE("1", "男性"),
        FEMALE("2", "女性"),
        OTHER("0", "不明");

        private final String id;
        private final String name;

        private Gender(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public Gender getById(String id) {
            for (Gender gender : Gender.values()) {
                if (gender.id.equals(id)) {
                    return gender;
                }
            }
            return null;
        }
    }
}
