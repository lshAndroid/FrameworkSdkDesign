package lsh.com.frameworksdkdesign;

import java.util.List;

public class NetJsonEntity {

    /**
     * code : 1
     * message : success
     * notice : {"newsCount":24}
     * result : {"items":[{"detail":"","href":"https://www.oschina.net/question/2720166_2304574","id":2304574,"img":"https://static.oschina.net/uploads/cooperation/75323/ubuntu-forum-black-sql_5728544f-2e7f-45ee-92da-dd81df8c8e0d.jpg","name":"高手问答：如何搭建 Nginx 高性能服务？","pubDate":"2019-03-20 10:33:07","type":2,"weight":5},{"detail":"","href":"https://www.oschina.net/event/2303765?origin=appbanner","id":2303765,"img":"https://static.oschina.net/uploads/cooperation/77929/top-income-programming-languages-2016_907fff9f-9086-45b6-afab-95a348b39fd7.png","name":"【苏州源创会】如何用 DevOps 打破开发与运维之间的隔阂？","pubDate":"2019-03-19 10:59:52","type":5,"weight":4},{"detail":"","href":"https://www.oschina.net/news/105256/jetbrains-java-learning-topics-highlights","id":105256,"img":"https://static.oschina.net/uploads/cooperation/78083/chrome55-save-at-least-35-percent-memory_953802ca-97e5-4880-a3a4-5577a7ecac36.jpg","name":"大多数 Java 开发人员不希望学习新语言","pubDate":"2019-03-19 10:58:04","type":6,"weight":3},{"detail":"","href":"https://www.oschina.net/news/105292/touchless-mode-chrome-feature-phones","id":105292,"img":"https://static.oschina.net/uploads/cooperation/78455/intellij-idea-2016-3-public-preview_c454a85d-cfeb-4a1e-91be-de94f4d0b09f.jpg","name":"功能机也不放过，谷歌或为 Chrome 提供非触控模式","pubDate":"2019-03-20 11:01:53","type":6,"weight":2},{"detail":"","href":"https://www.oschina.net/question/3820517_2304542","id":2304542,"img":"https://static.oschina.net/uploads/cooperation/75410/google-beta-natural-language-api_4aba6b6a-4a8b-4059-b176-361a67cc5564.jpg","name":"阿里开源 OpenJDK 发行版 Dragonwell","pubDate":"2019-03-19 10:55:22","type":2,"weight":1}],"nextPageToken":"61AF0C190D6BD629","prevPageToken":"3EA621243546C8A5","requestCount":5,"responseCount":5,"totalResults":5}
     * time : 2019-03-20 20:12:06
     */

    private int code;
    private String message;
    private NoticeBean notice;
    private ResultBean result;
    private String time;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public NoticeBean getNotice() {
        return notice;
    }

    public void setNotice(NoticeBean notice) {
        this.notice = notice;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public static class NoticeBean {
        /**
         * newsCount : 24
         */

        private int newsCount;

        public int getNewsCount() {
            return newsCount;
        }

        public void setNewsCount(int newsCount) {
            this.newsCount = newsCount;
        }
    }

    public static class ResultBean {
        /**
         * items : [{"detail":"","href":"https://www.oschina.net/question/2720166_2304574","id":2304574,"img":"https://static.oschina.net/uploads/cooperation/75323/ubuntu-forum-black-sql_5728544f-2e7f-45ee-92da-dd81df8c8e0d.jpg","name":"高手问答：如何搭建 Nginx 高性能服务？","pubDate":"2019-03-20 10:33:07","type":2,"weight":5},{"detail":"","href":"https://www.oschina.net/event/2303765?origin=appbanner","id":2303765,"img":"https://static.oschina.net/uploads/cooperation/77929/top-income-programming-languages-2016_907fff9f-9086-45b6-afab-95a348b39fd7.png","name":"【苏州源创会】如何用 DevOps 打破开发与运维之间的隔阂？","pubDate":"2019-03-19 10:59:52","type":5,"weight":4},{"detail":"","href":"https://www.oschina.net/news/105256/jetbrains-java-learning-topics-highlights","id":105256,"img":"https://static.oschina.net/uploads/cooperation/78083/chrome55-save-at-least-35-percent-memory_953802ca-97e5-4880-a3a4-5577a7ecac36.jpg","name":"大多数 Java 开发人员不希望学习新语言","pubDate":"2019-03-19 10:58:04","type":6,"weight":3},{"detail":"","href":"https://www.oschina.net/news/105292/touchless-mode-chrome-feature-phones","id":105292,"img":"https://static.oschina.net/uploads/cooperation/78455/intellij-idea-2016-3-public-preview_c454a85d-cfeb-4a1e-91be-de94f4d0b09f.jpg","name":"功能机也不放过，谷歌或为 Chrome 提供非触控模式","pubDate":"2019-03-20 11:01:53","type":6,"weight":2},{"detail":"","href":"https://www.oschina.net/question/3820517_2304542","id":2304542,"img":"https://static.oschina.net/uploads/cooperation/75410/google-beta-natural-language-api_4aba6b6a-4a8b-4059-b176-361a67cc5564.jpg","name":"阿里开源 OpenJDK 发行版 Dragonwell","pubDate":"2019-03-19 10:55:22","type":2,"weight":1}]
         * nextPageToken : 61AF0C190D6BD629
         * prevPageToken : 3EA621243546C8A5
         * requestCount : 5
         * responseCount : 5
         * totalResults : 5
         */

        private String nextPageToken;
        private String prevPageToken;
        private int requestCount;
        private int responseCount;
        private int totalResults;
        private List<ItemsBean> items;

        public String getNextPageToken() {
            return nextPageToken;
        }

        public void setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
        }

        public String getPrevPageToken() {
            return prevPageToken;
        }

        public void setPrevPageToken(String prevPageToken) {
            this.prevPageToken = prevPageToken;
        }

        public int getRequestCount() {
            return requestCount;
        }

        public void setRequestCount(int requestCount) {
            this.requestCount = requestCount;
        }

        public int getResponseCount() {
            return responseCount;
        }

        public void setResponseCount(int responseCount) {
            this.responseCount = responseCount;
        }

        public int getTotalResults() {
            return totalResults;
        }

        public void setTotalResults(int totalResults) {
            this.totalResults = totalResults;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public static class ItemsBean {
            /**
             * detail :
             * href : https://www.oschina.net/question/2720166_2304574
             * id : 2304574
             * img : https://static.oschina.net/uploads/cooperation/75323/ubuntu-forum-black-sql_5728544f-2e7f-45ee-92da-dd81df8c8e0d.jpg
             * name : 高手问答：如何搭建 Nginx 高性能服务？
             * pubDate : 2019-03-20 10:33:07
             * type : 2
             * weight : 5
             */

            private String detail;
            private String href;
            private int id;
            private String img;
            private String name;
            private String pubDate;
            private int type;
            private int weight;

            public String getDetail() {
                return detail;
            }

            public void setDetail(String detail) {
                this.detail = detail;
            }

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPubDate() {
                return pubDate;
            }

            public void setPubDate(String pubDate) {
                this.pubDate = pubDate;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getWeight() {
                return weight;
            }

            public void setWeight(int weight) {
                this.weight = weight;
            }
        }
    }
}
