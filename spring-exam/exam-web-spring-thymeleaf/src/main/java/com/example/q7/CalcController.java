package com.example.q7;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Q7. パラメータ<code>left</code>と<code>right</code>が数値でない場合に、
 * 入力画面にエラーメッセージを表示させるように修正しなさい。
 *
 * (エラーメッセージの例)
 * <pre>
 * ・左のテキストボックスには数値を入力してください。
 * ・右のテキストボックスには数値を入力してください。
 * </pre>
 */
@Controller
public class CalcController {

	// バリデーション, 保存用
	// 初めに実行されて履歴保存されるようにしとく
    @ModelAttribute("calcForm")
    public CalcForm setUpForm() {
        return new CalcForm();
    }

    @RequestMapping("/q7")
    public String gotoq7(@ModelAttribute("calcForm") CalcForm form) {
        // 初回表示
        return "7/calc";
    }

    @RequestMapping("/add")
    public String create(
            @Validated @ModelAttribute("calcForm") CalcForm form,
            BindingResult bindingResult,
            Model model) {

		// 1. エラーがあった時のバインディング
		if (bindingResult.hasErrors()) {
			return "7/calc";
		} 

        // 2. 数値変換チェック（数値でない場合のメッセージを出す）
        Integer leftVal = null;
        Integer rightVal = null;


        try {
            leftVal = Integer.parseInt(form.getLeft());
        } catch (NumberFormatException e) {
            model.addAttribute("leftError", "左のテキストボックスには数値を入力してください。");
        }

        try {
            rightVal = Integer.parseInt(form.getRight());
        } catch (NumberFormatException e) {
            model.addAttribute("rightError", "右のテキストボックスには数値を入力してください。");
        }

        // エラーなら表示しない
        if (leftVal == null || rightVal == null) {
            return "7/calc";
        }

		// 正常時だけ結果を表示
        Integer calcresult = leftVal + rightVal;
        model.addAttribute("result", calcresult);

        return "7/calc";
    }
}
