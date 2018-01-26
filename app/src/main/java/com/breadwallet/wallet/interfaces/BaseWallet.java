package com.breadwallet.wallet.interfaces;

import android.content.Context;

import com.breadwallet.presenter.entities.PaymentItem;

import java.math.BigDecimal;

/**
 * BreadWallet
 * <p/>
 * Created by Mihail Gutan on <mihail@breadwallet.com> 1/22/18.
 * Copyright (c) 2018 breadwallet LLC
 * <p/>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p/>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * <p/>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
public interface BaseWallet {

    //try sending a transaction
    boolean sendTransaction(Context app, PaymentItem item);

    //generate the wallet if needed
    boolean generateWallet(Context app);

    //init the current wallet
    boolean initWallet(Context app);

    //get the currency symbol e.g. Bitcoin - ₿, Ether - Ξ
    String getSymbol(Context app);

    //get the currency denomination e.g. Bitcoin - BTC, Ether - ETH
    String getIso(Context app);

    //get the currency name e.g. Bitcoin
    String getName(Context app);

    //get the number of decimal places to use for this currency
    int getMaxDecimalPlaces(Context app);

    //get the cached balance in the smallest unit: cents, satoshis.
    long getCachedBalance(Context app);

    //set the cached balance in the smallest unit: cents, satoshis.
    long setCashedBalance(Context app);

    //return the maximum amount for this currency
    BigDecimal maxAmount(Context app);

    //try parsing the URI and return true if it's a current wallet's request
    boolean tryUri(Context app, String uriStr);

}