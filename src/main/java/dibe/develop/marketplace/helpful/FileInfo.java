package dibe.develop.marketplace.helpful;

public class FileInfo {
    private String name;
    private String url;
    private String mime;

    public FileInfo(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }

    public String getMime() {
        return mime;
    }
}

