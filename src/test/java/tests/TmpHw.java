package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class TmpHw {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void successFillPracticeForm() {
        open("/automation-practice-form");
        $(".main-header").shouldHave(text("Practice Form"));

        //<input required="" autocomplete="off" placeholder="First Name" type="text" id="firstName" class=" mr-sm-2 form-control">
        $(".mr-sm-2.form-control#firstName").setValue("Vovan");

        //<input required="" autocomplete="off" placeholder="Last Name" type="text" id="lastName" class=" mr-sm-2 form-control">
        $(".mr-sm-2.form-control#lastName").setValue("deMort");

        //<input autocomplete="off" placeholder="name@example.com" type="text" id="userEmail" class="mr-sm-2 form-control">
        $(".mr-sm-2.form-control#userEmail").setValue("vmort@mailinataror.com");

        //<div class="custom-control custom-radio custom-control-inline"><input name="gender" required="" type="radio" id="gender-radio-1" class="custom-control-input" value="Male" data-com.bitwarden.browser.user-edited="yes"><label title="" for="gender-radio-1" class="custom-control-label">Male</label></div>
        $(".custom-control-label[for=gender-radio-1]").click();

        //<input required="" autocomplete="off" pattern="\d*" minlength="10" maxlength="10" placeholder="Mobile Number" type="text" id="userNumber" class=" mr-sm-2 form-control">
        $(".mr-sm-2.form-control#userNumber").setValue("1234567890");

        //<input type="text" id="dateOfBirthInput" class="form-control react-datepicker-ignore-onclickoutside" value="08 Feb 2022">
        $(".react-datepicker__input-container").click();
        //<select class="react-datepicker__month-select"><option value="0">January</option><option value="1">February</option><option value="2">March</option><option value="3">April</option><option value="4">May</option><option value="5">June</option><option value="6">July</option><option value="7">August</option><option value="8">September</option><option value="9">October</option><option value="10">November</option><option value="11">December</option></select>
        $(".react-datepicker__month-select").selectOption(3);
        //<select class="react-datepicker__year-select"><option value="1900">1900</option><option value="1901">1901</option><option value="1902">1902</option><option value="1903">1903</option><option value="1904">1904</option><option value="1905">1905</option><option value="1906">1906</option><option value="1907">1907</option><option value="1908">1908</option><option value="1909">1909</option><option value="1910">1910</option><option value="1911">1911</option><option value="1912">1912</option><option value="1913">1913</option><option value="1914">1914</option><option value="1915">1915</option><option value="1916">1916</option><option value="1917">1917</option><option value="1918">1918</option><option value="1919">1919</option><option value="1920">1920</option><option value="1921">1921</option><option value="1922">1922</option><option value="1923">1923</option><option value="1924">1924</option><option value="1925">1925</option><option value="1926">1926</option><option value="1927">1927</option><option value="1928">1928</option><option value="1929">1929</option><option value="1930">1930</option><option value="1931">1931</option><option value="1932">1932</option><option value="1933">1933</option><option value="1934">1934</option><option value="1935">1935</option><option value="1936">1936</option><option value="1937">1937</option><option value="1938">1938</option><option value="1939">1939</option><option value="1940">1940</option><option value="1941">1941</option><option value="1942">1942</option><option value="1943">1943</option><option value="1944">1944</option><option value="1945">1945</option><option value="1946">1946</option><option value="1947">1947</option><option value="1948">1948</option><option value="1949">1949</option><option value="1950">1950</option><option value="1951">1951</option><option value="1952">1952</option><option value="1953">1953</option><option value="1954">1954</option><option value="1955">1955</option><option value="1956">1956</option><option value="1957">1957</option><option value="1958">1958</option><option value="1959">1959</option><option value="1960">1960</option><option value="1961">1961</option><option value="1962">1962</option><option value="1963">1963</option><option value="1964">1964</option><option value="1965">1965</option><option value="1966">1966</option><option value="1967">1967</option><option value="1968">1968</option><option value="1969">1969</option><option value="1970">1970</option><option value="1971">1971</option><option value="1972">1972</option><option value="1973">1973</option><option value="1974">1974</option><option value="1975">1975</option><option value="1976">1976</option><option value="1977">1977</option><option value="1978">1978</option><option value="1979">1979</option><option value="1980">1980</option><option value="1981">1981</option><option value="1982">1982</option><option value="1983">1983</option><option value="1984">1984</option><option value="1985">1985</option><option value="1986">1986</option><option value="1987">1987</option><option value="1988">1988</option><option value="1989">1989</option><option value="1990">1990</option><option value="1991">1991</option><option value="1992">1992</option><option value="1993">1993</option><option value="1994">1994</option><option value="1995">1995</option><option value="1996">1996</option><option value="1997">1997</option><option value="1998">1998</option><option value="1999">1999</option><option value="2000">2000</option><option value="2001">2001</option><option value="2002">2002</option><option value="2003">2003</option><option value="2004">2004</option><option value="2005">2005</option><option value="2006">2006</option><option value="2007">2007</option><option value="2008">2008</option><option value="2009">2009</option><option value="2010">2010</option><option value="2011">2011</option><option value="2012">2012</option><option value="2013">2013</option><option value="2014">2014</option><option value="2015">2015</option><option value="2016">2016</option><option value="2017">2017</option><option value="2018">2018</option><option value="2019">2019</option><option value="2020">2020</option><option value="2021">2021</option><option value="2022">2022</option><option value="2023">2023</option><option value="2024">2024</option><option value="2025">2025</option><option value="2026">2026</option><option value="2027">2027</option><option value="2028">2028</option><option value="2029">2029</option><option value="2030">2030</option><option value="2031">2031</option><option value="2032">2032</option><option value="2033">2033</option><option value="2034">2034</option><option value="2035">2035</option><option value="2036">2036</option><option value="2037">2037</option><option value="2038">2038</option><option value="2039">2039</option><option value="2040">2040</option><option value="2041">2041</option><option value="2042">2042</option><option value="2043">2043</option><option value="2044">2044</option><option value="2045">2045</option><option value="2046">2046</option><option value="2047">2047</option><option value="2048">2048</option><option value="2049">2049</option><option value="2050">2050</option><option value="2051">2051</option><option value="2052">2052</option><option value="2053">2053</option><option value="2054">2054</option><option value="2055">2055</option><option value="2056">2056</option><option value="2057">2057</option><option value="2058">2058</option><option value="2059">2059</option><option value="2060">2060</option><option value="2061">2061</option><option value="2062">2062</option><option value="2063">2063</option><option value="2064">2064</option><option value="2065">2065</option><option value="2066">2066</option><option value="2067">2067</option><option value="2068">2068</option><option value="2069">2069</option><option value="2070">2070</option><option value="2071">2071</option><option value="2072">2072</option><option value="2073">2073</option><option value="2074">2074</option><option value="2075">2075</option><option value="2076">2076</option><option value="2077">2077</option><option value="2078">2078</option><option value="2079">2079</option><option value="2080">2080</option><option value="2081">2081</option><option value="2082">2082</option><option value="2083">2083</option><option value="2084">2084</option><option value="2085">2085</option><option value="2086">2086</option><option value="2087">2087</option><option value="2088">2088</option><option value="2089">2089</option><option value="2090">2090</option><option value="2091">2091</option><option value="2092">2092</option><option value="2093">2093</option><option value="2094">2094</option><option value="2095">2095</option><option value="2096">2096</option><option value="2097">2097</option><option value="2098">2098</option><option value="2099">2099</option><option value="2100">2100</option></select>
        $(".react-datepicker__year-select").selectOption("1999");

        //<div class="react-datepicker__day react-datepicker__day--022" tabindex="-1" aria-label="Choose Friday, March 22nd, 1991" role="option" aria-disabled="false">22</div>
        $(".react-datepicker__day.react-datepicker__day--021").click();

        $(".subjects-auto-complete__value-container.subjects-auto-complete__value-container--is-multi.css-1hwfws3").scrollIntoView(true);

        $(".subjects-auto-complete__value-container.subjects-auto-complete__value-container--is-multi.css-1hwfws3").click();
        //<input autocapitalize="none" autocomplete="off" autocorrect="off" id="subjectsInput" spellcheck="false" tabindex="0" type="text" aria-autocomplete="list" value="" style="box-sizing: content-box; width: 2px; background: 0px center; border: 0px; font-size: inherit; opacity: 1; outline: 0px; padding: 0px; color: inherit;">
        $("#subjectsInput").setValue("Hi");
            $(byText("History")).click();

            //<label title="" for="hobbies-checkbox-2" class="custom-control-label">Reading</label>
        $(".custom-control-label[for=hobbies-checkbox-2]").click();

        File file = new File("src/test/java/data/cat_4_qaguru_11.jpeg");
        $(".form-control-file#uploadPicture").uploadFile(file);

        //<textarea placeholder="Current Address" rows="5" cols="20" id="currentAddress" class="form-control"></textarea>
        $(".form-control#currentAddress").setValue("Main street,90210");

        //<div class="col-md-4 col-sm-12"><div class=" css-2b097c-container" id="city"><div class=" css-yk16xz-control"><div class=" css-1hwfws3"><div class=" css-1wa3eu0-placeholder">Select City</div><div class="css-1g6gooi"><div class="" style="display: inline-block;"><input autocapitalize="none" autocomplete="off" autocorrect="off" id="react-select-4-input" spellcheck="false" tabindex="0" type="text" aria-autocomplete="list" value="" style="box-sizing: content-box; width: 2px; background: 0px center; border: 0px; font-size: inherit; opacity: 1; outline: 0px; padding: 0px; color: inherit;"><div style="position: absolute; top: 0px; left: 0px; visibility: hidden; height: 0px; overflow: scroll; white-space: pre; font-size: 16px; font-family: -apple-system, &quot;system-ui&quot;, &quot;Segoe UI&quot;, Roboto, &quot;Helvetica Neue&quot;, Arial, &quot;Noto Sans&quot;, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;, &quot;Noto Color Emoji&quot;; font-weight: 400; font-style: normal; letter-spacing: normal; text-transform: none;"></div></div></div></div><div class=" css-1wy0on6"><span class=" css-1okebmr-indicatorSeparator"></span><div aria-hidden="true" class=" css-tlfecz-indicatorContainer"><svg height="20" width="20" viewBox="0 0 20 20" aria-hidden="true" focusable="false" class="css-19bqh2r"><path d="M4.516 7.548c0.436-0.446 1.043-0.481 1.576 0l3.908 3.747 3.908-3.747c0.533-0.481 1.141-0.446 1.574 0 0.436 0.445 0.408 1.197 0 1.615-0.406 0.418-4.695 4.502-4.695 4.502-0.217 0.223-0.502 0.335-0.787 0.335s-0.57-0.112-0.789-0.335c0 0-4.287-4.084-4.695-4.502s-0.436-1.17 0-1.615z"></path></svg></div></div></div></div></div>
        //<div class="col-md-4 col-sm-12"><div class=" css-2b097c-container" id="state"><div class=" css-yk16xz-control"><div class=" css-1hwfws3"><div class=" css-1uccc91-singleValue">Uttar Pradesh</div><div class="css-1g6gooi"><div class="" style="display: inline-block;"><input autocapitalize="none" autocomplete="off" autocorrect="off" id="react-select-3-input" spellcheck="false" tabindex="0" type="text" aria-autocomplete="list" value="" style="box-sizing: content-box; width: 2px; background: 0px center; border: 0px; font-size: inherit; opacity: 1; outline: 0px; padding: 0px; color: inherit;"><div style="position: absolute; top: 0px; left: 0px; visibility: hidden; height: 0px; overflow: scroll; white-space: pre; font-size: 16px; font-family: -apple-system, &quot;system-ui&quot;, &quot;Segoe UI&quot;, Roboto, &quot;Helvetica Neue&quot;, Arial, &quot;Noto Sans&quot;, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;, &quot;Noto Color Emoji&quot;; font-weight: 400; font-style: normal; letter-spacing: normal; text-transform: none;"></div></div></div></div><div class=" css-1wy0on6"><span class=" css-1okebmr-indicatorSeparator"></span><div aria-hidden="true" class=" css-tlfecz-indicatorContainer"><svg height="20" width="20" viewBox="0 0 20 20" aria-hidden="true" focusable="false" class="css-19bqh2r"><path d="M4.516 7.548c0.436-0.446 1.043-0.481 1.576 0l3.908 3.747 3.908-3.747c0.533-0.481 1.141-0.446 1.574 0 0.436 0.445 0.408 1.197 0 1.615-0.406 0.418-4.695 4.502-4.695 4.502-0.217 0.223-0.502 0.335-0.787 0.335s-0.57-0.112-0.789-0.335c0 0-4.287-4.084-4.695-4.502s-0.436-1.17 0-1.615z"></path></svg></div></div></div></div></div>
        $("#state").click();
        $(byText("Uttar Pradesh")).click();
        $("#city").click();
        $(byText("Merrut")).click();


        //<button id="submit" type="submit" class="btn btn-primary">Submit</button>
        $(".btn.btn-primary#submit").click();
        $(".modal-title.h4#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));

        $(".table.table-dark.table-striped.table-bordered.table-hover").shouldHave(text("Label"),text("Values"),
                text("Student Name"),text("Vovan deMort"),
                text("Student Email"),text("vmort@mailinataror.com"),
                text("Gender"),text("Male"),
                text("Mobile"),text("1234567890"),
                text("Date of Birth"),text("21 April,1999"),
                text("Subjects"),text("History"),
                text("Hobbies"),text("Reading"),
                text("Picture"),text("cat_4_qaguru_11.jpeg"),
                text("Address"),text("Main street,90210"),
                text("State and City"),text("Uttar Pradesh Merrut"));

        sleep(5000);
    }
}
