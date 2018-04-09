package com.example.lenovo.lianxi.Bean;

import java.util.List;

/**
 * Created by lenovo on 2018/4/9.
 */

public class Bean {

    /**
     * showapi_res_code : 0
     * showapi_res_error :
     * showapi_res_body : {"newslist":[{"title":"[贴图]女神啊，依然@幼我著迷－003－[65P]","picUrl":"http://image.hnol.net/c/2015-09/11/12/20150911125110511-4217076.jpg","description":"华声美女","ctime":"2016-03-06 14:11","url":"http://bbs.voc.com.cn/mm/meinv-6750084-0-1.html"},{"title":"美腿秀242（爱秀007 馨雅 2015.09.10）","picUrl":"http://image.hnol.net/c/2015-09/11/15/201509111534232761-2285289.jpg","description":"华声美女","ctime":"2016-03-06 14:11","url":"http://bbs.voc.com.cn/mm/meinv-6750435-0-1.html"},{"title":"[贴图]女神啊，依然@幼我著迷－004－[35P]","picUrl":"http://image.hnol.net/c/2015-09/11/20/201509112052464631-2285289.jpg","description":"华声美女","ctime":"2016-03-06 14:11","url":"http://bbs.voc.com.cn/mm/meinv-6751155-0-1.html"},{"title":"我的夏天","picUrl":"http://image.hnol.net/c/2015-09/13/00/201509130045137951-2381913.jpg","description":"华声美女","ctime":"2016-03-06 14:11","url":"http://bbs.voc.com.cn/mm/meinv-6752252-0-1.html"},{"title":"\u201c最靓校花\u201d","picUrl":"http://image.hnol.net/bbs/uface/a/2014-03/11/18/201403111813542868332.jpg","description":"华声美女","ctime":"2016-03-06 14:11","url":"http://bbs.voc.com.cn/mm/meinv-6752245-0-1.html"},{"title":"【美D共享】◆ 纯白女孩","picUrl":"http://image.hnol.net/c/2015-09/13/00/201509130018132891-2381913.jpg","description":"华声美女","ctime":"2016-03-06 14:11","url":"http://bbs.voc.com.cn/mm/meinv-6751756-0-1.html"},{"title":"[贴图]【美女共享】粉t色的回－003－[34P]","picUrl":"http://image.hnol.net/bbs/uface/a/2014-03/11/18/201403111813542868332.jpg","description":"华声美女","ctime":"2016-03-06 14:11","url":"http://bbs.voc.com.cn/mm/meinv-6751818-0-1.html"},{"title":"【美D共享】◆ 模特小倩","picUrl":"http://image.hnol.net/c/2015-09/08/15/201509081534411731-2089977.jpg","description":"华声美女","ctime":"2016-03-06 14:11","url":"http://bbs.voc.com.cn/mm/meinv-6751780-0-1.html"},{"title":"【美D共享】◆ 美媚写真","picUrl":"http://image.hnol.net/c/2015-09/08/15/201509081547332321-2089977.jpg","description":"华声美女","ctime":"2016-03-06 14:11","url":"http://bbs.voc.com.cn/mm/meinv-6751766-0-1.html"},{"title":"星期八 - 女女 - [分享]","picUrl":"http://image.hnol.net/c/2015-09/12/12/20150912122513483-4758611.jpg","description":"华声美女","ctime":"2016-03-06 14:11","url":"http://bbs.voc.com.cn/mm/meinv-6751533-0-1.html"}],"code":200,"msg":"success"}
     */

    private int showapi_res_code;
    private String showapi_res_error;
    private ShowapiResBodyBean showapi_res_body;

    public int getShowapi_res_code() {
        return showapi_res_code;
    }

    public void setShowapi_res_code(int showapi_res_code) {
        this.showapi_res_code = showapi_res_code;
    }

    public String getShowapi_res_error() {
        return showapi_res_error;
    }

    public void setShowapi_res_error(String showapi_res_error) {
        this.showapi_res_error = showapi_res_error;
    }

    public ShowapiResBodyBean getShowapi_res_body() {
        return showapi_res_body;
    }

    public void setShowapi_res_body(ShowapiResBodyBean showapi_res_body) {
        this.showapi_res_body = showapi_res_body;
    }

    public static class ShowapiResBodyBean {
        /**
         * newslist : [{"title":"[贴图]女神啊，依然@幼我著迷－003－[65P]","picUrl":"http://image.hnol.net/c/2015-09/11/12/20150911125110511-4217076.jpg","description":"华声美女","ctime":"2016-03-06 14:11","url":"http://bbs.voc.com.cn/mm/meinv-6750084-0-1.html"},{"title":"美腿秀242（爱秀007 馨雅 2015.09.10）","picUrl":"http://image.hnol.net/c/2015-09/11/15/201509111534232761-2285289.jpg","description":"华声美女","ctime":"2016-03-06 14:11","url":"http://bbs.voc.com.cn/mm/meinv-6750435-0-1.html"},{"title":"[贴图]女神啊，依然@幼我著迷－004－[35P]","picUrl":"http://image.hnol.net/c/2015-09/11/20/201509112052464631-2285289.jpg","description":"华声美女","ctime":"2016-03-06 14:11","url":"http://bbs.voc.com.cn/mm/meinv-6751155-0-1.html"},{"title":"我的夏天","picUrl":"http://image.hnol.net/c/2015-09/13/00/201509130045137951-2381913.jpg","description":"华声美女","ctime":"2016-03-06 14:11","url":"http://bbs.voc.com.cn/mm/meinv-6752252-0-1.html"},{"title":"\u201c最靓校花\u201d","picUrl":"http://image.hnol.net/bbs/uface/a/2014-03/11/18/201403111813542868332.jpg","description":"华声美女","ctime":"2016-03-06 14:11","url":"http://bbs.voc.com.cn/mm/meinv-6752245-0-1.html"},{"title":"【美D共享】◆ 纯白女孩","picUrl":"http://image.hnol.net/c/2015-09/13/00/201509130018132891-2381913.jpg","description":"华声美女","ctime":"2016-03-06 14:11","url":"http://bbs.voc.com.cn/mm/meinv-6751756-0-1.html"},{"title":"[贴图]【美女共享】粉t色的回－003－[34P]","picUrl":"http://image.hnol.net/bbs/uface/a/2014-03/11/18/201403111813542868332.jpg","description":"华声美女","ctime":"2016-03-06 14:11","url":"http://bbs.voc.com.cn/mm/meinv-6751818-0-1.html"},{"title":"【美D共享】◆ 模特小倩","picUrl":"http://image.hnol.net/c/2015-09/08/15/201509081534411731-2089977.jpg","description":"华声美女","ctime":"2016-03-06 14:11","url":"http://bbs.voc.com.cn/mm/meinv-6751780-0-1.html"},{"title":"【美D共享】◆ 美媚写真","picUrl":"http://image.hnol.net/c/2015-09/08/15/201509081547332321-2089977.jpg","description":"华声美女","ctime":"2016-03-06 14:11","url":"http://bbs.voc.com.cn/mm/meinv-6751766-0-1.html"},{"title":"星期八 - 女女 - [分享]","picUrl":"http://image.hnol.net/c/2015-09/12/12/20150912122513483-4758611.jpg","description":"华声美女","ctime":"2016-03-06 14:11","url":"http://bbs.voc.com.cn/mm/meinv-6751533-0-1.html"}]
         * code : 200
         * msg : success
         */

        private int code;
        private String msg;
        private List<NewslistBean> newslist;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public List<NewslistBean> getNewslist() {
            return newslist;
        }

        public void setNewslist(List<NewslistBean> newslist) {
            this.newslist = newslist;
        }

        public static class NewslistBean {
            /**
             * title : [贴图]女神啊，依然@幼我著迷－003－[65P]
             * picUrl : http://image.hnol.net/c/2015-09/11/12/20150911125110511-4217076.jpg
             * description : 华声美女
             * ctime : 2016-03-06 14:11
             * url : http://bbs.voc.com.cn/mm/meinv-6750084-0-1.html
             */

            private String title;
            private String picUrl;
            private String description;
            private String ctime;
            private String url;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getPicUrl() {
                return picUrl;
            }

            public void setPicUrl(String picUrl) {
                this.picUrl = picUrl;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getCtime() {
                return ctime;
            }

            public void setCtime(String ctime) {
                this.ctime = ctime;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
