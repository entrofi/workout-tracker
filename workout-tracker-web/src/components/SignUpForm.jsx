import React from 'react';
import PropTypes from 'prop-types';
import {Link, Route}  from 'react-router-dom';
import { Card, CardText, CardTitle } from 'material-ui/Card';
import RaisedButton from 'material-ui/RaisedButton';
import TextField from 'material-ui/TextField';



const SignUpForm = ({
                        onSubmit,
                        onChange,
                        errors,
                        user,
                    }) => (
    <Card className="container">
        <form action="/" onSubmit={onSubmit}>
            <h2 className="card-heading">Sign Up</h2>

            {errors.summary && <p className="error-message">{errors.summary}</p>}

            <div className="field-line">
                <TextField
                    floatingLabelText="Name"
                    name="firstname"
                    errorText={errors.firstname}
                    onChange={onChange}
                    value={user.firstname}
                />
            </div>

            <div className="field-line">
                <TextField
                    floatingLabelText="Lastname"
                    name="lastname"
                    errorText={errors.lastname}
                    onChange={onChange}
                    value={user.lastname}
                />
            </div>

            <div className="field-line">
                <TextField
                    floatingLabelText="Username"
                    name="username"
                    errorText={errors.username}
                    onChange={onChange}
                    value={user.username}
                />
            </div>

            <div className="field-line">
                <TextField
                    floatingLabelText="Email"
                    name="email"
                    errorText={errors.email}
                    onChange={onChange}
                    value={user.email}
                />
            </div>

            <div className="field-line">
                <TextField
                    floatingLabelText="Password"
                    type="password"
                    name="password"
                    onChange={onChange}
                    errorText={errors.password}
                    value={user.password}
                />
            </div>

            <div className="button-line">
                <RaisedButton type="submit" label="Create New Account" primary />
            </div>

            <CardText>Already have an account? <Link to={'/login'}>Log in</Link></CardText>
        </form>
    </Card>
);

SignUpForm.propTypes = {
    onSubmit: PropTypes.func.isRequired,
    onChange: PropTypes.func.isRequired,
    errors: PropTypes.object.isRequired,
    user: PropTypes.object.isRequired
};

export default SignUpForm;