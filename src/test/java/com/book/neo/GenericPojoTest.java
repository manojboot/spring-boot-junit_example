package com.book.neo;

import org.junit.Test;

public class GenericPojoTest {

	@Test
    public void testAccesors_shouldAccessProperField() {
 
        PojoUtilTest.validateAccessors(CommonResponse.class);
        PojoUtilTest.validateAccessors(User.class);
        PojoUtilTest.validateAccessors(UserResponse.class);
    }
}
