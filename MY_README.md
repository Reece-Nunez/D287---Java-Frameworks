STEP C:
    Files: mainscreen.html
    Lines: 14, 19, 21, 53
    Changes: customized the HTML user interface with custom names for shop, parts, and products. Also had to change the 
        port to 8081 due to my PC already using port 8080.

STEP D:
    Files: mainscreen.html, about.html
    Lines:
        mainscreen.html: 15-20, 23-27
        about.html: Entire file
    Changes:
        mainscreen.html: Created navigation to about us page with some styling.
        about.html: Created about us page with some styling.

STEP E:
    Files: BootStrapData.java
    Lines: 41-70
    Changes: Added sample data with five parts and five products.

STEP F:
    Files: AddProductController.java, mainscreen.html, outofstock.html, purchaseconfirmation.html
    Lines:
        AddProductController.java: 171-185
        mainscreen.html: 96
        outofstock.html: Entire file
        purchaseconfirmation.html: Entire file
    Changes:
        AddproductController.java: Created a mapping method named buyProduct(). This method gets the inventory of the
            product and if it is greater than 0 when you push the buy now button it will take you to the confirmation page.
            But if it is less than 0 when you push the buy now button it will take you to the out of stock page.
        mainscreen.html: Added a buy now button
        outofstock.html: Added this for failed purchase
        purchaseconfirmation.html: Added this for a successful purchase

STEP G:
    Files: AddInhousePartController.java, AddOutSourcedPartController.java, application.properties, BootStrapData.java,
        InhousePartForm.html, OutSourcedPartForm.html, mainscreen.html, Part.java
    Lines:
        AddInhousePartController.java: 46-54
        AddOutSourcedPartController.java: 47-56
        applicaiton.properties: 7
        BootStrapData.java: 47-51
        InhousePartForm.html: 25-26
        OutsourcedPartForm.html: 25-26
        mainscreen.html: 49-50, 59-60
        Part.java: 31-32, 42, 46-47, 50, 55-72
    Changes:
        AddInhousePartController.java: Added logic to check if the inventory is below the minimum inventory if it is it will
            throw an error. if it is greater than the maximum inventory it will throw an error.
        AddOutSourcedPartController.java: Added logic to check if the inventory is below the minimum inventory if it is it will
            throw an error. if it is greater than the maximum inventory it will throw an error.
        application.properties: renamed the file the persistent storage is saved to
        BootStrapData.java: Updated the sample inventory to show the minimum and maximum fields.
        inhousePartForm.html: Added the fields to input minimum and maximum inventory.
        OutsourcedPartForm.html: Added the fields to input minimum and maximum inventory.
        mainscreen.html: Added the minimum and maximum inventory fields to the mainscreen.
        Part.java: Added the minInv, maxInv, and their getters and setters to the part domain.

STEP H:
    Files: AddProdcutController.java
    Lines: 55-72
    Changes: Added logic to get the product inventory and the part inventory associated with that product.
        Then it checks to see for each part in that product if the new inventory of the updated or added product is less than
        the part minimum inventory, it will throw an error saying that adding or updating that part will bring its inventory
        below its minimum limit.

STEP I:
    Files: PartTest.java
    Lines: 161-187
    Changes: Added two tests for the maximum and minimum fields to test whether the min inv is less than the max inv.
        and the max inv is greater than the min inv.

STEP J:
    Files: AddProductController.java, InhousePartServiceImpl.java, MainScreenControllerr.java, OutsourcedPartServiceImpl.java,
        PartServiceImpl.java, ProductServiceImpl.java, EnufPartsValidator.java, ValidEnufParts.java
    Lines: 
        AddProductController.java: 96, 131-132, 150, 155
        InhousePartServiceImpl.java: 42-45
        MainscreenControllerr.java: 25-26, 33-37, 49
        OutsourcedPartServiceImpl.java: 40-43
        PartServiceImpl.java: 50
        ProductServiceImpl.java: 45
        EnufPartsValidator.java: Entire file
        ValidEnufParts.java: Entire file
    Changes: In all the files above I just got rid of any code that wasn't necessary. Also got rid of the Enuf validator
        due to my validation changes in step H.