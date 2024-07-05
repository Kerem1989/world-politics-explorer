package com.example.worldpoliticsexplorer;

import java.util.Map;

public class RestCountry {
    private Name name;
    private String[] capital;
    private int population;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String[] getCapital() {
        return capital;
    }

    public void setCapital(String[] capital) {
        this.capital = capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public static class Name {
        private String common;
        private String official;
        private Map<String, NativeName> nativeName;

        // Getters and setters
        public String getCommon() {
            return common;
        }

        public void setCommon(String common) {
            this.common = common;
        }

        public String getOfficial() {
            return official;
        }

        public void setOfficial(String official) {
            this.official = official;
        }

        public Map<String, NativeName> getNativeName() {
            return nativeName;
        }

        public void setNativeName(Map<String, NativeName> nativeName) {
            this.nativeName = nativeName;
        }

        public static class NativeName {
            private String official;
            private String common;

            // Getters and setters
            public String getOfficial() {
                return official;
            }

            public void setOfficial(String official) {
                this.official = official;
            }

            public String getCommon() {
                return common;
            }

            public void setCommon(String common) {
                this.common = common;
            }
        }
    }
}
