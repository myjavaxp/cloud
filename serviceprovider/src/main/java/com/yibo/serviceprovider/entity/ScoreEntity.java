package com.yibo.serviceprovider.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@NamedNativeQueries({
        @NamedNativeQuery(name = "ScoreEntity.getScoreDetail",
                query = "SELECT\n" +
                        "  concat(t0.number, t0.check_category) AS category,\n" +
                        "  t1.id                                AS contentId,\n" +
                        "  t1.number                            AS checkNumber,\n" +
                        "  t1.check_category                    AS checkCategory,\n" +
                        "  t1.check_content                     AS checkContent,\n" +
                        "  t1.weight,\n" +
                        "  t2.id                                AS detailId,\n" +
                        "  t2.number                            AS detailNumber,\n" +
                        "  t2.criterion,\n" +
                        "  t2.check_result                      AS checkResult,\n" +
                        "  t2.description ,\n" +
                        "  t2.img_url                           AS imgUrl,\n" +
                        "  comp.id                              AS compId\n" +
                        "FROM\n" +
                        "  template_content t0\n" +
                        "  LEFT JOIN template_content t1\n" +
                        "    ON t1.parent_id = t0.id\n" +
                        "  RIGHT JOIN\n" +
                        "  (SELECT\n" +
                        "     s1.id,\n" +
                        "     s1.number,\n" +
                        "     s1.criterion,\n" +
                        "     s1.template_content_id,\n" +
                        "     s2.check_result,\n" +
                        "     s2.description,\n" +
                        "     s2.img_url,\n" +
                        "     s1.sort\n" +
                        "   FROM template_content_detail s1 LEFT JOIN check_detail_result s2 ON s2.template_content_detail_id = s1.id\n" +
                        "   WHERE s2.schedual_id = ?1 AND s1.status = 1 AND s2.status = 1) t2 ON t2.template_content_id = t1.id\n" +
                        "  LEFT JOIN (SELECT\n" +
                        "               id,\n" +
                        "               template_content_detail_id\n" +
                        "             FROM comp_result\n" +
                        "             WHERE status = 1 AND schedual_id = ?1) comp ON t2.id = comp.template_content_detail_id\n" +
                        "WHERE t0.template_id = ?2 AND t1.status = 1\n" +
                        "ORDER BY t0.sort, t1.sort, t2.sort;",
                resultSetMapping = "scoreEntity")})
@SqlResultSetMapping(
        name = "scoreEntity",
        entities = {
                @EntityResult(entityClass = ScoreEntity.class,
                        fields = {
                                @FieldResult(name = "category", column = "category"),
                                @FieldResult(name = "contentId", column = "contentId"),
                                @FieldResult(name = "checkNumber", column = "checkNumber"),
                                @FieldResult(name = "checkCategory", column = "checkCategory"),
                                @FieldResult(name = "checkContent", column = "checkContent"),
                                @FieldResult(name = "weight", column = "weight"),
                                @FieldResult(name = "detailId", column = "detailId"),
                                @FieldResult(name = "criterion", column = "criterion"),
                                @FieldResult(name = "checkResult", column = "checkResult"),
                                @FieldResult(name = "description", column = "description"),
                                @FieldResult(name = "imgUrl", column = "imgUrl"),
                                @FieldResult(name = "detailNumber", column = "detailNumber"),
                                @FieldResult(name = "compId", column = "compId")
                        }
                )
        }
)
@Entity
public class ScoreEntity implements Serializable {
    private static final long serialVersionUID = -4060892437167563781L;
    private String category;
    private Long contentId;//contentId
    private String checkNumber;//序号
    private String checkCategory;//检查项目
    private String checkContent;//检查内容
    private BigDecimal weight;//权重
    private Long detailId;//隐藏项，最小子项ID
    private String criterion;//未达到原因
    private Byte checkResult;//判断结果
    private String description;//描述
    private String imgUrl;//图片路径
    @Id
    private String detailNumber;//明细编号
    private Long compId;//明细项对应的申述记录

    public ScoreEntity() {
    }

    public ScoreEntity(String category, Long contentId, String checkNumber, String checkCategory, String checkContent, BigDecimal weight, Long detailId, String criterion, Byte checkResult, String description, String imgUrl, String detailNumber, Long compId) {
        this.category = category;
        this.contentId = contentId;
        this.checkNumber = checkNumber;
        this.checkCategory = checkCategory;
        this.checkContent = checkContent;
        this.weight = weight;
        this.detailId = detailId;
        this.criterion = criterion;
        this.checkResult = checkResult;
        this.description = description;
        this.imgUrl = imgUrl;
        this.detailNumber = detailNumber;
        this.compId = compId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getContentId() {
        return contentId;
    }

    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public String getCheckCategory() {
        return checkCategory;
    }

    public void setCheckCategory(String checkCategory) {
        this.checkCategory = checkCategory;
    }

    public String getCheckContent() {
        return checkContent;
    }

    public void setCheckContent(String checkContent) {
        this.checkContent = checkContent;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Long getDetailId() {
        return detailId;
    }

    public void setDetailId(Long detailId) {
        this.detailId = detailId;
    }

    public String getCriterion() {
        return criterion;
    }

    public void setCriterion(String criterion) {
        this.criterion = criterion;
    }

    public Byte getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(Byte checkResult) {
        this.checkResult = checkResult;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDetailNumber() {
        return detailNumber;
    }

    public void setDetailNumber(String detailNumber) {
        this.detailNumber = detailNumber;
    }

    public Long getCompId() {
        return compId;
    }

    public void setCompId(Long compId) {
        this.compId = compId;
    }

    @Override
    public String toString() {
        return "ScoreEntity{" +
                "category='" + category + '\'' +
                ", contentId=" + contentId +
                ", checkNumber='" + checkNumber + '\'' +
                ", checkCategory='" + checkCategory + '\'' +
                ", checkContent='" + checkContent + '\'' +
                ", weight=" + weight +
                ", detailId=" + detailId +
                ", criterion='" + criterion + '\'' +
                ", checkResult=" + checkResult +
                ", description='" + description + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", detailNumber='" + detailNumber + '\'' +
                ", compId=" + compId +
                '}';
    }
}