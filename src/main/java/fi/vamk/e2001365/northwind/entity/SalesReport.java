package fi.vamk.e2001365.northwind.entity;

import javax.persistence.*;

@Entity
@Table(name = "sales_reports")
public class SalesReport {
    @Id
    @Column(name = "group_by", nullable = false, length = 50)
    private String id;

    @Column(name = "display", length = 50)
    private String display;

    @Column(name = "title", length = 50)
    private String title;

    @Lob
    @Column(name = "filter_row_source")
    private String filterRowSource;

    @Column(name = "`default`", nullable = false)
    private Boolean _default = false;

    public Boolean get_default() {
        return _default;
    }

    public void set_default(Boolean _default) {
        this._default = _default;
    }

    public String getFilterRowSource() {
        return filterRowSource;
    }

    public void setFilterRowSource(String filterRowSource) {
        this.filterRowSource = filterRowSource;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}