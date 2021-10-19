package homework_5;

import org.testng.annotations.Test;

public class AddCommentToArticlePageFactory extends BaseTest {

    @Test
    public void addCommentToArticle() {
        getDriver().get("http://shop.demoqa.com/author/lsharm/");
        AllArticlesByAuthorPageFactory AllArticlesByAuthorPageFactory = new AllArticlesByAuthorPageFactory(getDriver());
        AllArticlesByAuthorPageFactory.scrollToReadMoreButton();
        AllArticlesByAuthorPageFactory.clickReadMoreButton();
        CertainArticlePageFactory certainArticlePageFactory = new CertainArticlePageFactory(getDriver());
        certainArticlePageFactory.scrollToCommentForm();
        certainArticlePageFactory.fillCommentField("TestName", "test@gmail.com", "www.bbc.com", "Some comment");
        certainArticlePageFactory.submitCommentForm();
        allureLog("Adding a comment to an article ");
    }


}
